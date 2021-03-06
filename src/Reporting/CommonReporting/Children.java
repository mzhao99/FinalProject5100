/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting.CommonReporting;

import Actions.Shelter.Admin.Shelter;
import Adoption.Adoption.Adoption;
import Reporting.Parent.Parent;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;


/**
 *
 * @author harold
 */
public class Children {
    private String name;
    private Date foundDate;
    private int foundLocationZipCode;
    private String region;
    private String dob;
    private int approxAge;
    private String sex;
    private String race;
    private String hairColor;
    private String eyeColor;
    private String height;
    private String weight;
    private String status;
    private String id;
    private String reporter;
    private String reporterType;
    private String missingDate;
    private Image childImage;
    private Date adoptionDate;
    private Parent parent;
    private Adoption adoption;

    public Adoption getAdoption() {
        return adoption;
    }

    public void setAdoption(Adoption adoption) {
        this.adoption = adoption;
    }
            

    public Date getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(Date adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
            
    private String medicalAdvice;
    private Shelter shelter;
    private String injury;
    private ImageIcon photo;
    private static int count =1;

    public Image getChildImage() {
        return childImage;
    }

    public void setChildImage(Image childImage) {
        this.childImage = childImage;
    }
    

    public Children() {
        
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

    
    public String getInjury() {
        return injury;
    }

    public void setInjury(String injury) {
        this.injury = injury;
    }


    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }


    public String getMedicalAdvice() {
        return medicalAdvice;
    }

    public void setMedicalAdvice(String medicalAdvice) {
        this.medicalAdvice = medicalAdvice;
    }    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public int getFoundLocationZipCode() {
        return foundLocationZipCode;
    }

    public void setFoundLocationZipCode(int foundLocaion) {
        this.foundLocationZipCode = foundLocaion;
    }

    public int getApproxAge() {
        return approxAge;
    }

    public void setApproxAge(int approxAge) {
        this.approxAge = approxAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Children.count = count;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getReporterType() {
        return reporterType;
    }

    public void setReporterType(String reporterType) {
        this.reporterType = reporterType;
    }

    public String getMissingDate() {
        return missingDate;
    }

    public void setMissingDate(String missingDate) {
        this.missingDate = missingDate;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
    
    @Override
    public String toString() {
        return name;
    }
    

}