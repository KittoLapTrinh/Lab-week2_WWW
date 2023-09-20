package fit.edu.iuh.vn.labweek2.enums;

public enum ProductStatus {

    ACTIVE(1),
    IN_ACTIVE(0),
    TERMINATED(-1);

    private int value;

    ProductStatus(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
