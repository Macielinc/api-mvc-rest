package uia.com.apimvcrest.modelo;

public class PeticionOrdenCompraModelo {
    private int id=-1;
    private String name="";
    private String codigo="";
    private String unidad="";
    private int cantidad=-1;



    public PeticionOrdenCompraModelo(int id, String name, String codigo, String unidad, int cantidad)
    {
        this.id=id;
        this.name = name;
        this.codigo = codigo;
        this.unidad = unidad;
        this.cantidad = cantidad;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(int vendedor) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void print()
    {
        System.out.println(
                " \n\tid:\t"+this.id
                        +" \n\tname:\t"+this.name
                        +" \n\tcodigo:\t"+this.codigo
                        +" \n\tunidad:\t"+this.unidad
                        +" \n\tcantidad:\t"+this.cantidad);
    }
}

