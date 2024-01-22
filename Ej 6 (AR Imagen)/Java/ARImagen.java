//DeathbatO

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class ARImagen{
    public static void main(String[] args) {
        // URL de la imagen
        String imageUrl = "https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png";

        try {
            // Descargar la imagen desde la URL
            URL url = new URL(imageUrl);
            try (InputStream in = url.openStream(); FileOutputStream out = new FileOutputStream("imagen.png")) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer, 0, 1024)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }

            // Leer la imagen usando OpenCV
            Mat image = Imgcodecs.imread("imagen.png");
            int height = image.rows();
            int width = image.cols();
            double aspectRatio = (double) width / height;

            System.out.println("La imagen tiene " + height + " pixeles de alto");
            System.out.println("Y tiene " + width + " pixeles de ancho");
            System.out.printf("Por lo que su Aspect Ratio es: %.2f\n", aspectRatio);

            // Puedes realizar más operaciones con la imagen si es necesario

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}