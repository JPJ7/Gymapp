package org.meicode.gymapplication;

import java.util.ArrayList;

public class Utils {
    private static ArrayList<Training> trainings;
    private static ArrayList<Plan> plans;

    public static void initTrainings () {
        if (null == trainings) {
            trainings = new ArrayList<>();
        }

        Training pushUp = new Training(1, "Lagartija", "Ejercicio en el que una persona se acuesta de cara al suelo y, manteniendo la espalda recta, levanta el cuerpo presionando las manos.",
                "Definición de una lagartija es un ejercicio que se realiza acostado con la cara, las palmas y los dedos de los pies hacia abajo, manteniendo las piernas y la espalda rectas, extendiendo los brazos para empujar el cuerpo hacia arriba y hacia abajo nuevamente. Una lagartija es un gran ejercicio que trabaja los músculos del pecho, los hombros y los brazos.",
                "https://www.istreetwatch.co.uk/wp-content/uploads/2019/01/push-ups.jpg");
        trainings.add(pushUp);

        Training squat = new Training(2, "Sentadilla", "Agáchate muy bajo sobre tus talones",
                "Una sentadilla es un ejercicio de fuerza en el que el alumno baja las caderas desde una posición de pie y luego se pone de pie. Durante el descenso de una sentadilla, las articulaciones de la cadera y la rodilla se flexionan mientras que la articulación del tobillo se flexiona dorsalmente; a la inversa, las articulaciones de la cadera y la rodilla se extienden y la articulación del tobillo se flexiona al ponerse de pie.",
                "https://lmimirror3pvr.azureedge.net/static/media/16949/921e38e6-9020-4dd9-a619-7726cadc7284/fit-planet-60-hero-image-960x540.jpg");
        trainings.add(squat);

        Training legPress = new Training(3, "Presión de piernas", "La presión de piernas es un ejercicio de entrenamiento con pesas en el que la persona empuja un peso o una resistencia con las piernas.",
                "La presión de piernas es un ejercicio de entrenamiento con pesas en el que la persona empuja un peso o una resistencia con las piernas. El término presión de piernas también se refiere al aparato utilizado para realizar este ejercicio. La presión de piernas se puede utilizar para evaluar la fuerza general de la parte inferior del cuerpo de un atleta (desde la articulación de la rodilla hasta la cadera).",
                "https://www.fitnessfactoryoutlet.com/images/products/14392.png");
        trainings.add(legPress);

        Training pectorals = new Training(4, "Pectorales", "Asombroso para construir los músculos del pecho",
                "Los músculos pectorales son uno de los grupos de músculos más grandes de la parte superior del cuerpo. Tiran del húmero (hueso de la parte superior del brazo), lo que le permite realizar movimientos verticales, horizontales y de rotación con los brazos. Usas estos músculos todo el día, todos los días, por lo que es importante mantenerlos fuertes.",
                "https://img.freepik.com/foto-gratis/atractiva-mujer-mediana-edad-forma-haciendo-ejercicio-tabla-mientras-trabaja-gimnasio_136403-4572.jpg?size=626&ext=jpg");
        trainings.add(pectorals);

        Training pullUps = new Training(5, "Dominadas", "Un ejercicio que consiste en levantarse con los brazos tirando de una barra horizontal fijada por encima de la cabeza.",
                "Una dominada es un ejercicio de fuerza para la parte superior del cuerpo. La dominada es un movimiento de cadena cerrada en el que el cuerpo se suspende por las manos y tira hacia arriba. Mientras esto sucede, los codos se flexionan y los hombros se aducen y se extienden para llevar los codos al torso.",
                "https://www.fititnow.com/wp-content/uploads/2020/02/3-Simple-Tips-To-Improve-Your-Pull-Ups.jpg");
        trainings.add(pullUps);
    }

    public static ArrayList<Training> getTrainings() {
        return trainings;
    }

    public static boolean addPlan(Plan plan) {
        if (null == plans) {
            plans = new ArrayList<>();
        }

        return plans.add(plan);
    }

    public static ArrayList<Plan> getPlans() {
        return plans;
    }

    public static boolean removePlan(Plan plan) {
        return plans.remove(plan);
    }
}
