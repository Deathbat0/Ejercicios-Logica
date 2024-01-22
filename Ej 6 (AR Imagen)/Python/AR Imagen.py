## DeathbatO

import requests
import cv2 as cv

url_im = "https://upload.wikimedia.org/wikipedia/commons/7/77/Google_Developer.jfg.png"
nom_loc_im = "imagen.png"
im = requests.get(url_im).content
with open(nom_loc_im, "wb") as handler:
    handler.write(im)

imagen = cv.imread('D:\DeathbatO\Documents\Repositorio\imagen.png')
heigth, width, c = imagen.shape
aspect_ratio = width/heigth
ar = aspect_ratio*10
print(f"La imagen tiene {heigth} pixeles de alto")
print(f"Y tiene {width} pixeles de ancho")
print("Por lo que su Aspect Ratio es: {0:.2f}".format(aspect_ratio))
print("Dicho en otras palabras {0:.0f}:10".format(ar))
cv.imshow("Imagen", imagen)
cv.waitKey(0)