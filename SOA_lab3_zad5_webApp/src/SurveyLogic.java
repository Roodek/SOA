import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.Arrays;

@ManagedBean(name = "SurveyLogic")
@SessionScoped
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
    private String[] preferences ={};

    private double chestCirc;
    private String cupsize;
    private double waist;
    private double hips;

    private double chest;
    private double waistSize;




    public void valueChanged(String selected){
        System.out.println(selected);
        this.servSex();

    }

    public void servSex(){

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
        return preferences;
    }

    public void setPreferences(String[] preferences) {
        this.preferences = preferences;
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
        valueChanged(sex);
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

    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }
    public void setAge(int age){
        this.age=age;
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

    public String getChestCirc() {
        return Double.toString(chestCirc);
    }

    public void setChestCirc(double chestCirc) {
        this.chestCirc = chestCirc;
    }

    public String getCupsize() {
        return cupsize;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public String getWaist() {
        return Double.toString(waist);
    }

    public void setWaist(String waist) {
        this.waist = Double.parseDouble(waist);
    }

    public String getHips() {
        return Double.toString(hips);
    }

    public void setHips(String hips) {
        this.hips = Double.parseDouble(hips);
    }

    public String getChest() {
        return Double.toString(chest);
    }

    public void setChest(String chest) {
        this.chest = Double.parseDouble(chest);
    }

    public String getWaistSize() {
        return Double.toString(waistSize);
    }

    public void setWaistSize(String waistSize) {
        this.waistSize = Double.parseDouble(waistSize);
    }
}
