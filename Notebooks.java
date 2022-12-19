public class Notebooks {
    private int id;
    private int capacityHardDrive;
    private int capacityRam;
    private int diagonal;
    private String operatingSystem;
    private String color;
    private String brand;

public Notebooks(int id, int capacityHardDrive, int capacityRam, int diagonal, String operatingSystem, String color,
            String brand) {
        this.id = id;
        this.capacityHardDrive = capacityHardDrive;
        this.capacityRam = capacityRam;
        this.diagonal = diagonal;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.brand = brand;
    }

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((brand == null) ? 0 : brand.hashCode());
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    result = prime * result + diagonal;
    result = prime * result + capacityHardDrive;
    result = prime * result + id;
    result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
    result = prime * result + capacityRam;
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Notebooks other = (Notebooks) obj;
    if (brand == null) {
        if (other.brand != null)
            return false;
    } else if (!brand.equals(other.brand))
        return false;
    if (color == null) {
        if (other.color != null)
            return false;
    } else if (!color.equals(other.color))
        return false;
    if (diagonal != other.diagonal)
        return false;
    if (capacityHardDrive != other.capacityHardDrive)
        return false;
    if (id != other.id)
        return false;
    if (operatingSystem == null) {
        if (other.operatingSystem != null)
            return false;
    } else if (!operatingSystem.equals(other.operatingSystem))
        return false;
    if (capacityRam != other.capacityRam)
        return false;
    return true;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public int getHDDvolume() {
    return capacityHardDrive;
}

public void setHDDvolume(int volume) {
    this.capacityHardDrive = volume;
}

public int getRAMvolume() {
    return capacityRam;
}

public void setRAMvolume(int volume) {
    this.capacityRam = volume;
}

public int getDisplSize() {
    return diagonal;
}

public void setDisplSize(int size) {
    this.diagonal = size;
}

public String getBrand() {
    return brand;
}

public void setBrand(String name) {
    this.brand = name;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public String getOStype() {
    return operatingSystem;
}

public void setOStype(String type) {
    this.operatingSystem = type;
}

@Override
public String toString() {
    return "{id=" + id + ",  brand=" + brand + ", color=" + color + ", diagonal=" + diagonal + ", capacityHardDrive="
            + capacityHardDrive + ",  capacityRam=" + capacityRam+",  operatingSystem=" + operatingSystem+ "}";
}

}