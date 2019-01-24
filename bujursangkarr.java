package com.company;

public class bujursangkarr {
        public static void main(String[] args) {
            Bujur keliling = new Bujur();
            keliling.Hitung();

        }

        class Bujur{
            public int sisi = 4;
            public double KelilingBujurSangkar;

            public void Hitung(){
                KelilingBujurSangkar = 4*sisi;
                System.out.println ("Keliling Bujur Sangkar Adalah = " + KelilingBujurSangkar);

            }
        }
    }

