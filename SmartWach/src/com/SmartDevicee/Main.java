package com.SmartDevicee;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        SmartWatch relojAplle = new SmartWatch("Rojo", "Apple", "Smart", 2022, 123.3, "Apaga");
        //System.out.println(relojAplle);
       SmartWatch relojQQ = new SmartWatch("Negro", "QQ","Acero", 2023, 100.2, "Apaga" );
        System.out.println(relojQQ.fabricante);


       SmartPhone tefonoMi = new SmartPhone("Blaco", "Xiami", "Mi8", 2022, 150.3, 6.8, "Si","Si"  );
            //System.out.println(tefonoMi);


}}
