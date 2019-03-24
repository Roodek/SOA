import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import java.util.ArrayList;
import java.util.Arrays;

@ManagedBean(name = "SurveyLogic")
@ViewScoped
public class SurveyLogic {

    private String name;
    private String email;
    private int age;
    private static String sex = "male";
    private String Education;
    private int height;


    private boolean contSur = false;
    private boolean femAdditionalInfo = false;
    private boolean malAdditionalInfo = false;

    private String potentialExp;
    private String buyingFreq;
    private String[] col = {};
    private String[] Preferences={};

    private double chestCirc;
    private double cupsize;
    private double waist;
    private double hips;

    private double chest;
    private double waistSize;




    public void valueChanged(String selected){
        System.out.println(selected);
        this.servSex(selected);

    }

    public void servSex(String sex){
        this.setSex(sex);
        if(sex.equals("male")){
            this.changeMalAdditionalInfo();
        }else {
            this.changeFemAdditionalInfo();
        }
    }
    public int[] getHeightLimits(){
        if (sex.equals("male")){
            int[] retval = {165,200};
            return retval;
        }else {
            int[] retval = {150,185};
            return retval;
        }
    }

    public String[] getPreferences() {
        return Preferences;
    }

    public void setPreferences(String[] preferences) {
        Preferences = preferences;
    }

    public ArrayList<String> getSexPreferences(){
        if(this.getSex().equals("male")){
            return new ArrayList<String>(Arrays.asList("Spodnie", "Spodenki", "Garnitury", "Krawaty"));
        }
        else {
            return new ArrayList<String>(Arrays.asList("garsonki", "bluzki", "spódniczki", "spodnie"));
        }
    }
    public boolean isContSur() {
        return contSur;
    }

    public void changeContSur(){
        this.contSur = true;
    }

    public void setContSur(boolean contSur) {
        this.contSur = contSur;
    }

    public boolean isFemAdditionalInfo() {
        return femAdditionalInfo;
    }

    public void changeFemAdditionalInfo(){
        this.femAdditionalInfo = true;
    }

    public void setFemAdditionalInfo(boolean additionalInfo) {
        this.femAdditionalInfo = additionalInfo;
    }
    public boolean isMalAdditionalInfo() {
        return malAdditionalInfo;
    }

    public void changeMalAdditionalInfo(){
        this.malAdditionalInfo = true;
    }

    public void setMalAdditionalInfo(boolean additionalInfo) {
        this.malAdditionalInfo = additionalInfo;
    }

    public String[] getCol() {
        return col;
    }

    public void setCol(String[] col) {
        this.col = col;
    }

    public String getBuyingFreq() {
        return buyingFreq;
    }

    public void setBuyingFreq(String buyingFreq) {
        this.buyingFreq = buyingFreq;
    }

    public String getPotentialExp() {
        return potentialExp;
    }

    public void setPotentialExp(String potentialExp) {
        this.potentialExp = potentialExp;
    }

    public ArrayList<String> getSexes(){
        return new ArrayList<String>(Arrays.asList("male", "female"));
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getEducation() {
        return Education;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getChestCirc() {
        return chestCirc;
    }

    public void setChestCirc(double chestCirc) {
        this.chestCirc = chestCirc;
    }

    public double getCupsize() {
        return cupsize;
    }

    public void setCupsize(double cupsize) {
        this.cupsize = cupsize;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public double getHips() {
        return hips;
    }

    public void setHips(double hips) {
        this.hips = hips;
    }

    public double getChest() {
        return chest;
    }

    public void setChest(double chest) {
        this.chest = chest;
    }

    public double getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(double waistSize) {
        this.waistSize = waistSize;
    }
}
