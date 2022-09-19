import tkinter as tk

root = tk.Tk()
root.geometry("200x100")

label = tk.Label(text="LABEL")
btn = tk.Button(text="push")

label.pack()
btn.pack()
tk.mainloop()