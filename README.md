# Java-
Java课程作业项目仓库
# 实验目的
用类描述计算机CPU的速度与硬盘容量

# 阅读程序

## 实验过程
写框架在Test主类下有CPU HardDisk PC 三个分类，主类从分类中调取参数并且设计调用显示函数show()
从而达到显示CPU的速度以及硬盘容量。
在experiment的创建项目同时创建包one在此包下进行类的创建并且编写程序

创建CPU_1类，创建参数speed，并创建方法getSpeed，用于之后为speed赋值
创建HardDisk_1类，创建参数amonut，并创建方法getAmount，用于之后为amount赋值
创建PC类，创建属性cpu和HD，并创建方法getCPU、getHardDisk，为属性赋值，并创建显示函数show（）
函数中利用打印函数对最终的cpu速度和硬盘容量进行显示
最后创建主类Test，首先将Test类里设置主函数，调用上述三类中的函数，并为其赋值、和显示

#核心代码
CPU_1类
class CPU_1{
 int speed;
 int getSpeed(){
  return speed;
 }
 public void setSpeed(int speed){
  this.speed = speed;
  }
}
HardDisk_1类
class HardDisk_1 {
 int amount;
 int getAmount(){
  return amount;
 }
 public void setAmount(int amount){
  this.amount = amount;
  }
}
PC类
class PC{
  CPU_1 cpu;
  HardDisk_1 HD;
     public void setCPU(CPU_1 cpu) {
      this.cpu = cpu;
      }
     public void setHardDisk(HardDisk_1 h){
      this.HD = h;
     }
     public void show(){
      System.out.println("cpu速度为: " +cpu.getSpeed());
         System.out.println("硬盘容量为: "+HD.getAmount());
     }

}
Test主类
public class Test {
 public static void main(String args[]){
  CPU_1 cpu = new CPU_1();
  cpu.setSpeed(3000);
  
  HardDisk_1 disk = new HardDisk_1();
  disk.setAmount(600);
  
  PC pc = new PC();
  pc.setCPU(cpu);
  pc.setHardDisk(disk);
  pc.show();
 }

}


## 核心方法
1. 方法1 用eclipse编写代码编译调试运行
2. 方法2 用GitHub提交实验报告


## 实验结果
CPU速度3000
硬盘容量600

## 实验感想
Java有和其他语言不同的语法以及设计结构，尤其是各个包和类之间的参数调用。
在编程的过程中，不管是标点符号还是缩进都需要严格的按照规范编写，否则就会出错。

##出现的问题
在编写过程中，忘了加分号忘记看标示，程序运行不成功，后来将分号补上，成功运行参数不一致，在赋值过程中因为语法错误或者
加了个点或者加了个空格造成没有正确调用参数，修改后运行成功。后来尝试在不同的包里进行类别的创建和调用，并对参数属性进行了private加密，
使其他类文件不可以调用此参数。


