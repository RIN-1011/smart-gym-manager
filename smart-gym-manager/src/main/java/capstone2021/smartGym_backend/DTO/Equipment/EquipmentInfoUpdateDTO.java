package capstone2021.smartGym_backend.DTO.Equipment;

public class EquipmentInfoUpdateDTO {
    private Long equipmentID;
    private String equipmentName;
    private String equipmentNameNth;
    private String equipmentCategoryList;
    private int equipmentAvailable;

    public Long getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(Long equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentNameNth() {
        return equipmentNameNth;
    }

    public void setEquipmentNameNth(String equipmentNameNth) {
        this.equipmentNameNth = equipmentNameNth;
    }

    public String getEquipmentCategoryList() {
        return equipmentCategoryList;
    }

    public void setEquipmentCategoryList(String equipmentCategoryList) {
        this.equipmentCategoryList = equipmentCategoryList;
    }

    public int getEquipmentAvailable() {
        return equipmentAvailable;
    }

    public void setEquipmentAvailable(int equipmentAvailable) {
        this.equipmentAvailable = equipmentAvailable;
    }
}
