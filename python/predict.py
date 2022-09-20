import sklearn.datasets
import sklearn.svm
iport PIL.Image
import numpy

def imageToData(filename):
  grayImage = PIL.Image.open(filename).convert("L")
  grayImage = grayImage.resize((8,8),PIL.Image.Resampling.LANCZOS)
  
  numImage = numpy.asarray(grayImage, dtype = float)
  numImage = 16 - numpy.floor(17 * numImage / 256)
  numImage =numImage.flatten()
  
  return numImage
  
  def predictDigits(data):
    digits = sklearn.datasets.load_digits()
    clf = sklearn.svm.SVC(gamma = 0.001)
    slf.fit(digits.data, digits.target)
    n = clf.predict([data])
    print("予測=" ,n)
    
data = imageToData("2.png")
predictDigits(data)