public class Hanoi {

        public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
        {

            if (n == 1)
            {
                System.out.println("Переместить диск 1 со стрежня " +  from_rod + " на стержень " + to_rod);
                return;
            }
            towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
            System.out.println("Переместить диск " + n + " со стержня " +  from_rod + " на стержень " + to_rod);
            towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
        }
    }

