public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    double firstStart=Math.random() * 100;

    public void startFight() {
        int i=1;
        System.out.println("Seçilen sayı 0-50 aralığında ise 1 numaralı dövüşçü ilk vuruşu yapacak aksi halde 2 numaralı dövüşçü ilk vuruşu yapacak! ");
        System.out.println("Başlangıç için seçilen numara:"+firstStart);
        if (checkWeight()) {
            if(firstStart<50) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("========" +i+".ROUND ===========");
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                printScore();
                i++;
            }
            }else{while (f1.health > 0 && f2.health > 0) {
                System.out.println("========"+i+".ROUND ===========");
                f1.health = f2.hit(f1);
                if (isWin()){
                    break;
                }
                f2.health = f1.hit(f2);
                if (isWin()){
                    break;
                }
                printScore();
                i++;
            }

            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Gecenin şampiyonu : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Gecenin şampiyonu : " + f1.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
