package com.company;

public class lgkrn {
        public static void main(String[] args) {
            Bulat keliling = new Bulat();
            keliling.Hitung();

        }

        class Bulat {
            double phi = 3.14;
            double r = 11;
            double KelilingLingkaran;

            void Hitung() {
                KelilingLingkaran = 2 * phi * r;
                System.out.println("Keliling Lingkaran Adalah = " + KelilingLingkaran);
            }
        }
    }


