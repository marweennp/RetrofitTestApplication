package com.hotix.retrofittestapplication;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("ProfileId")
    @Expose
    private Integer profileId;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("DateFront")
    @Expose
    private String dateFront;
    @SerializedName("Error")
    @Expose
    private Integer error;
    @SerializedName("HasConfig")
    @Expose
    private Boolean hasConfig;
    @SerializedName("HasAddPanne")
    @Expose
    private Boolean hasAddPanne;
    @SerializedName("HasAddObjet")
    @Expose
    private Boolean hasAddObjet;
    @SerializedName("HasClosePanne")
    @Expose
    private Boolean hasClosePanne;
    @SerializedName("HasCloseObjet")
    @Expose
    private Boolean hasCloseObjet;
    @SerializedName("HasMouchard")
    @Expose
    private Boolean hasMouchard;
    @SerializedName("HasChangeStatut")
    @Expose
    private Boolean hasChangeStatut;
    @SerializedName("HasEtatLieu")
    @Expose
    private Boolean hasEtatLieu;
    @SerializedName("HasViewClient")
    @Expose
    private Boolean hasViewClient;
    @SerializedName("HasFM")
    @Expose
    private Boolean hasFM;
    @SerializedName("Hotel")
    @Expose
    private String hotel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateFront() {
        return dateFront;
    }

    public void setDateFront(String dateFront) {
        this.dateFront = dateFront;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public Boolean getHasConfig() {
        return hasConfig;
    }

    public void setHasConfig(Boolean hasConfig) {
        this.hasConfig = hasConfig;
    }

    public Boolean getHasAddPanne() {
        return hasAddPanne;
    }

    public void setHasAddPanne(Boolean hasAddPanne) {
        this.hasAddPanne = hasAddPanne;
    }

    public Boolean getHasAddObjet() {
        return hasAddObjet;
    }

    public void setHasAddObjet(Boolean hasAddObjet) {
        this.hasAddObjet = hasAddObjet;
    }

    public Boolean getHasClosePanne() {
        return hasClosePanne;
    }

    public void setHasClosePanne(Boolean hasClosePanne) {
        this.hasClosePanne = hasClosePanne;
    }

    public Boolean getHasCloseObjet() {
        return hasCloseObjet;
    }

    public void setHasCloseObjet(Boolean hasCloseObjet) {
        this.hasCloseObjet = hasCloseObjet;
    }

    public Boolean getHasMouchard() {
        return hasMouchard;
    }

    public void setHasMouchard(Boolean hasMouchard) {
        this.hasMouchard = hasMouchard;
    }

    public Boolean getHasChangeStatut() {
        return hasChangeStatut;
    }

    public void setHasChangeStatut(Boolean hasChangeStatut) {
        this.hasChangeStatut = hasChangeStatut;
    }

    public Boolean getHasEtatLieu() {
        return hasEtatLieu;
    }

    public void setHasEtatLieu(Boolean hasEtatLieu) {
        this.hasEtatLieu = hasEtatLieu;
    }

    public Boolean getHasViewClient() {
        return hasViewClient;
    }

    public void setHasViewClient(Boolean hasViewClient) {
        this.hasViewClient = hasViewClient;
    }

    public Boolean getHasFM() {
        return hasFM;
    }

    public void setHasFM(Boolean hasFM) {
        this.hasFM = hasFM;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", profileId=" + profileId +
                ", fullName='" + fullName + '\'' +
                ", dateFront='" + dateFront + '\'' +
                ", error=" + error +
                ", hasConfig=" + hasConfig +
                ", hasAddPanne=" + hasAddPanne +
                ", hasAddObjet=" + hasAddObjet +
                ", hasClosePanne=" + hasClosePanne +
                ", hasCloseObjet=" + hasCloseObjet +
                ", hasMouchard=" + hasMouchard +
                ", hasChangeStatut=" + hasChangeStatut +
                ", hasEtatLieu=" + hasEtatLieu +
                ", hasViewClient=" + hasViewClient +
                ", hasFM=" + hasFM +
                ", hotel='" + hotel + '\'' +
                '}';
    }
}