import tkinter as tk
import tkinter.filedaialog as 

import sklearn.datasets
import sklearn.svm
import PIL.Image
import numpy

# 画像ファイルをうちリストに変換
def imageToData(filename):
  # 画像をグレースケールに変換
  grayImage = PIL.Image.open(filename).convert("L")
  grayImage = grayImage.resize((8,8),PIL.Image.Resampling.LANCZOS)
  # 画像を表示する
  dispImage = PIL.ImageTk.PhotoImage(grayImage.resize((300,300),resample=0))
  
  
  numImage = numpy.asarray(grayImage, dtype = float)
  numImage = 16 - numpy.floor(17 * numImage / 256)
  numImage =numImage.flatten()
  
  return numImage
  
def predictDigits(data):
  digits = sklearn.datasets.load_digits()
  clf = sklearn.svm.SVC(gamma = 0.001)
  clf.fit(digits.data, digits.target)
  n = clf.predict([data])
  print("予測=" ,n)
    
data = imageToData("2.png")
predictDigits(data)