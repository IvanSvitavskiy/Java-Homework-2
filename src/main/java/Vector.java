import java.util.Arrays;
import java.util.Objects;

public class Vector {
    private double x = 0;
    private double y = 0;
    private double z = 0;


    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Длина вектора. Корень из суммы квадратов
    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    // метод, вычисляющий скалярное произведение
    public double scalarProduct(Vector vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    // метод, вычисляющий векторное произведение
    public Vector crossProduct(Vector vector) {
        double x1 = this.y * vector.z - this.z * vector.y;
        double y1 = this.z * vector.x - this.x * vector.z;
        double z1 = this.x * vector.y - this.y * vector.x;
        return new Vector(x1, y1, z1);
    }

    // Косинус между двумя векторами
    public double cos(Vector vector) {
        return scalarProduct(vector) / (this.length() * vector.length());
    }

    // Сумма двух векторов
    public Vector add(Vector vector) {
        double x1 = this.x + vector.x;
        double y1 = this.y + vector.y;
        double z1 = this.z + vector.z;
        return new Vector(x1, y1, z1);
    }

    // Разность двух веторов
    public Vector subtract(Vector vector) {
        double x1 = this.x - vector.x;
        double y1 = this.y - vector.y;
        double z1 = this.z - vector.z;
        return new Vector(x1, y1, z1);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y, this.z});
    }

    public boolean equals(Vector vector) {
        if (vector == this) return true;
        if (vector== null || vector.getClass()!= this.getClass()){
            return false;
        }
        return this.x==vector.x && this.y==vector.y && this.z== vector.z;
    }

    public void print(){
        System.out.print(this.x + " ");
        System.out.print(this.y + " ");
        System.out.println(this.z);
    }
}
