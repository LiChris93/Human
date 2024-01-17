package org.example;

public class Human {
    int age;
    String sex;
    String name;
    public Human(String name,int age,String sex){//构造函数，赋予被实例化的实例属性（其实是就是变量的值）
        this.name = name;
        if(age < 0){
            throw new IllegalArgumentException("年龄不能为负");
        }
        this.age = age;
        if(!sex.equals("男") && !sex.equals("女")){
            throw new IllegalArgumentException("性别只能为男或女");
        }
        this.sex = sex;
    }
//    public String getName(){
//        return this.name;
//    }
//    public int getAge(){
//        return this.age;
//    }
//    public String getSex(){
//        return this.sex;
//    }
    public void introduce(){
        System.out.println("我叫"+this.name+","+"我"+age+"岁,我的性别是"+this.sex);
    }
    public void eat(){
        System.out.println(name+"正在吃饭");
    }
    public void eat(String food){
        System.out.println(name+"正在吃"+food);
    }
    public void walk(){
        System.out.println(name+"正在走路");
    }
    public void walk(double meter){
        System.out.println(name+"正在走"+meter+"m");
    }
    public void play(){
        System.out.println(name+"正在玩");
    }
    public void play(String game){
        System.out.println(name+"正在玩"+game);
    }
}
