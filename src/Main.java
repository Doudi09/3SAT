import BSO.BSO;
import GeneticAlgorithm.Population;

import PSO.PSO;
import SAT.SAT;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.ArrayList;


public class Main {


    public static int CLAUSENBR = 325;
    public static int VARIABLENBR = 75;
    public static int TARGET = 325;

    public static void main(String[] args) {


        //BSO algorithm
        ArrayList<String> file = new ArrayList<>();
        //String pathFile = "D:\\MES ETUDES\\S2\\Méta\\SAT\\hoos\\Shortcuts\\UF75.325.100\\uf75-0";
        String pathFile = "D:\\MES ETUDES\\S2\\Méta\\USAT\\uuf75-0";
        double t1, t2, delta;
        // file = readFile(pathFile + 1 + ".cnf");
        // SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);
        //BSO bso = new BSO(sat);
        //   bso.run(1,TARGET, 10, 3,4000,15);
        int bestmutation = 5;
        int fit = 0;
        int bestFit = 0;


        //this is the traitement for GA
        for(int i =1; i<=10;i++){
            //sat.show();
            // for (int i = 0;i<100;i++){
            file = readFile(pathFile+i+".cnf");
            SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);

            Population population = new Population(24, VARIABLENBR, 6, 35, sat);
            t1 = System.currentTimeMillis();
            fit = population.traitementWithImmigration(1020, TARGET,500);
            t2 = System.currentTimeMillis();
            delta = (t2 - t1) / 1000;
            if(fit>bestFit){
                bestmutation = i;
                bestFit = fit;
            }
            System.out.println("le temps d'exécution pour le fichier "+i+" >>>"+ delta + " min\n fitness : "+fit);

        }



        /**
        //this is the traitement for GA
        for(int i =1; i<=100;i++){
            file = readFile(pathFile+i+".cnf");
            SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);
            //sat.show();
            // for (int i = 0;i<100;i++){
            Population population = new Population(30, VARIABLENBR, 10, 35, sat);
            t1 = System.currentTimeMillis();
            population.traitementWithImmigration(5000, TARGET,500);
            t2 = System.currentTimeMillis();
            delta = (t2 - t1) / 1000 / 60;
            System.out.println("le temps d'exécution pour le fichier "+i+" >>>"+ delta + " min");

        }**/




        /*

        for (int i = 1; i <= 10; i++) {
            file = readFile(pathFile + i + ".cnf");
            SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);
            BSO bso = new BSO(sat);
            t1 = System.currentTimeMillis();
            fit = bso.run(1, TARGET, 18, 5, 2540
                    , 26);
            t2 = System.currentTimeMillis();

            System.out.println("the file " +i);
            System.out.println("the time " + (t2 - t1) / 1000);
            System.out.println("the fit " + fit);

        }


         */



        /*for (int k = 1; k <= 10; k++) {
            SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);
            file = readFile(pathFile + k + ".cnf");


            for (int i = 1; i <= 10; i++) {

                BSO bso = new BSO(sat);
                //t1 = System.currentTimeMillis();
                fit = bso.run(1, TARGET, 18, i, 2540
                        , 26);
                //t2=System.currentTimeMillis();

                if (bestfit <= fit) {
                    bestChnce = i;
                    bestfit = fit;
                }
            }

            System.out.println("the file  " + k+" ---------------------");
            System.out.println("the best chance " + bestChnce);
            System.out.println("the best fitness " + bestfit);


       }


         */


        /* fixing the nbrLocalBee
        for (int i = 5; i <= 50; i=i+5) {

            BSO bso = new BSO(sat);
            //t1 = System.currentTimeMillis();
            fit = bso.run(1, TARGET, 10, 3, 2540
                    , i);
            //t2=System.currentTimeMillis();

            if (bestfit < fit) {
                bestLocalBee = i;
                bestfit = fit;
            }
        }

        System.out.println("the best localBee " + bestLocalBee);
        System.out.println("the best fitness " + bestfit);



         */

        /*for (int k = 1; k <= 10; k++) {
            SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);
            file = readFile(pathFile + k + ".cnf");
            t1 = System.currentTimeMillis();
            BSO bso = new BSO(sat);
            //t1 = System.currentTimeMillis();
            fit = bso.run(1, TARGET, 18, 1, 2540
                    , 26);
            //t2=System.currentTimeMillis();
            t2 = System.currentTimeMillis();
            System.out.println("the file  " + k);
            System.out.println("the best fitness " + fit);
            delta = (t2-t1)/1000;
            System.out.println("the time " + delta + " sec");


        }

         */


        /*int bestfit = 0;
        int fit = 0;
        int bestFlip = 0;
        int iterati = 0;

        for (int i = 1; i <= 75; i++) {

            BSO bso = new BSO(sat);
            //t1 = System.currentTimeMillis();
            fit = bso.run(i, TARGET, 10, 3, 2540
                    , 15);
            //t2=System.currentTimeMillis();

            if (bestfit < fit) {
                bestFlip = i;
                bestfit = fit;
            }
        }

        System.out.println("the best flip " + bestFlip);
        System.out.println("the best fitness " + bestfit);



         */

        /*ArrayList<Integer> lisste = new ArrayList<>();
        for(int i=1;i<=10;i++){

            file = readFile(pathFile + i + ".cnf");
            SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);

            BSO bso = new BSO(sat);
            lisste.add(bso.run(1,TARGET, 10, 3,4000,15));
        }

        System.out.println("the final results :");
        for(int i=0;i<10;i++){
            System.out.println("the file " +(i+1)+" the solution : "+lisste.get(i));
        }


         */
        /*
        file = readFile(pathFile + 1 + ".cnf");
        SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);

        BSO bso = new BSO(sat);
*/


/*
        ArrayList arrayb = new ArrayList(Arrays.asList(0, 1, 1, 1, 0, 0, 1, 0, 0,
         1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0,
         1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0,
         0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0
        ));


        //308

        ArrayList arraya = new ArrayList(Arrays.asList(0, 1, 1, 1, 0, 0, 1, 0, 0, 1,
        1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0,
        0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1,
         1, 1, 1, 1, 1, 1, 1, 1, 1, 0
        ));

        System.out.println("the lenght " + arrayb.size());

        System.out.println("a : " + sat.evaluate(arrayb));
        System.out.println("b : " + sat.evaluate(arraya));

*/

        //312:
        //bso.run(25, TARGET, 50, 3, 2000, 10);
        //316:
        // bso.run(8, TARGET, 50, 5, 8000, 10);
        //319:
        //bso.run(5,TARGET, 10, 3,3500,15);
        //324 :O
        // bso.run(2,TARGET, 10, 3,3500,15);
        //325 shit !
        // bso.run(1,TARGET, 10, 3,4000,15);






        /*


        //calcul de la moyenne :
        double a[] = {299.5,


                298.8

        };

        double s = 0;
        for (int i = 0; i < a.length; i++)
            s = s + a[i];
        System.out.println("la moyenne " + s / a.length);

         */


        /**
         ArrayList<String> file = new ArrayList<>();
         //String pathFile = "D:\\MES ETUDES\\S2\\Méta\\SAT\\hoos\\Shortcuts\\UF75.325.100\\uf75-0";
         String pathFile = "D:\\MES ETUDES\\S2\\Méta\\USAT\\uuf75-0";
         double t1, t2, delta;
         //   file = readFile("D:\\MES ETUDES\\S2\\Méta\\USAT\\uuf75-01.cnf");

         //sat.show();
         for (int i = 1; i <= 10; i++) {
         for (int j = 1; j <= 2; j++) {

         //1>> PSO pso = new PSO(20, sat, 1.42694, 1.42694, 0.689343);
         //2>> PSO pso = new PSO(20, sat, 1.42694, 1.42694, 0.689343);
         // PSO pso = new PSO(20, sat, 1.7, 2.1, 1);
         file = readFile(pathFile + i + ".cnf");
         SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);
         PSO pso = new PSO(130, sat, 1.1, 1.3, 0.625);


         //PSO pso = new PSO(20, sat, 1.5, 1.5, 1);
         t1 = System.currentTimeMillis();
         //pso.traitement(50000, TARGET);
         //vmax the best === 2.2  and the alpha is 2.4
         pso.traitement(1990, TARGET);
         t2 = System.currentTimeMillis();
         delta = (t2 - t1) / 1000;

         System.out.println(" >> le temps d'exécution pour le fichier " + i + "\n pour essaye num  "+j+">>>  " + delta + " sec");

         }
         }
         **/

        /**
         file = readFile(pathFile);
         while(iteration<=4000){
         particule = 50;



         SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);
         PSO pso = new PSO(particule, sat, 1.1, 1.3, 0.625);


         //PSO pso = new PSO(20, sat, 1.5, 1.5, 1);
         t1 = System.currentTimeMillis();
         //pso.traitement(50000, TARGET);
         //vmax the best === 2.2  and the alpha is 2.4
         int a = pso.traitement(iteration, TARGET);
         t2 = System.currentTimeMillis();
         delta = (t2 - t1) / 1000 / 60;
         if (a > bestfitness) {
         bestIteration = iteration;
         bestParticule= particule;
         bestfitness = a;
         }

         System.out.println(" >> le temps d'exécution min " + delta);


         iteration= iteration + 100;
         }


         System.out.println("the best parameters :");
         System.out.println("the iteration +++ " + bestIteration);
         System.out.println("the particules +++ " +particule );

         System.out.println("teh best fitness " + bestfitness);
         **/


        /**
         ////// ***************************
         //reglage de nombre de particule



         file = readFile(pathFile);

         particule =10;
         iteration = 1990;
         while(particule<=200){




         SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);
         PSO pso = new PSO(particule, sat, 1.1, 1.3, 0.625);


         //PSO pso = new PSO(20, sat, 1.5, 1.5, 1);
         t1 = System.currentTimeMillis();
         //pso.traitement(50000, TARGET);
         //vmax the best === 2.2  and the alpha is 2.4
         int a = pso.traitement(iteration, TARGET);
         t2 = System.currentTimeMillis();
         delta = (t2 - t1) / 1000 / 60;
         if (a > bestfitness) {
         bestParticule = particule;
         bestfitness = a;
         }

         System.out.println(" >> le temps d'exécution min " + delta);


         particule = particule + 10;
         }

         System.out.println("the best parameters :");
         System.out.println("the best particule +++ " + bestParticule);

         System.out.println("teh best fitness " + bestfitness);
         **/
        /**
         ///************************
         //setting hyper parameters
         double c1Best, c2Best, wBest;
         double c1, c2, w;
         int bestfitness = 0;


         c1Best = 0.25;
         c2Best = 0.25;
         wBest = 0.25;

         w = 0.25;
         c1 = 0.25;
         c2 = 0.25;
         file = readFile(pathFile);


         while (c1 <= 2) {
         c2 = 0.25;
         while (c2 <= 2) {
         w = 0.25;
         while (w <= 1) {

         SAT sat = new SAT(file, VARIABLENBR, CLAUSENBR);
         PSO pso = new PSO(50, sat, c1, c2, w);


         //PSO pso = new PSO(20, sat, 1.5, 1.5, 1);
         t1 = System.currentTimeMillis();
         //pso.traitement(50000, TARGET);
         //vmax the best === 2.2  and the alpha is 2.4
         int a = pso.traitement(20000, TARGET);
         t2 = System.currentTimeMillis();
         delta = (t2 - t1) / 1000 / 60;
         if (a > bestfitness) {
         c1Best = c1;
         c2Best = c2;
         wBest = w;
         bestfitness = a;
         }

         System.out.println(" >> le temps d'exécution min " + delta);
         w = w + 0.25;
         }
         c2 = c2 + 0.25;
         }
         c1 = c1 + 0.25;
         }


         System.out.println("the best parameters :");
         System.out.println("the W +++ " + wBest);
         System.out.println("the C1 +++ " + c1Best);
         System.out.println("the C2 +++ " + c2Best);
         System.out.println("teh best fitness " + bestfitness);
         //***************************************************************
         **/







        /**
         *
         * instance for file 09
         *
         *
         * int t [] = {1, 2, -3, 4,-5, 6, 7, 8, 9, -10,
         *                 -11, -12, -13, 14, -15, -16, -17, -18, -19, -20,
         *                 21, -22, -23, -24, 25 ,-26, 27 ,28 ,-29, -30,
         *                 -31 ,32 ,-33, -34, -35, 36 ,37 ,38 ,39 ,40,
         *                 -41, 42 ,-43, 44, 45, 46, 47, 48, 49, -50,
         *                 51, -52, -53, -54, 55 ,-56, 57 ,58 ,-59, -60,
         *                 61 ,62 ,-63, -64, -65, -66, -67 ,68 ,-69, -70,
         *                 71, 72 ,-73, 74 ,75};
         *
         *         System.out.println(sat.evaluate2(new DNA(t)));
         *
         *
         */


        /**ArrayList<String> clasues = new ArrayList<>();
         clasues.add("-1 2 0");
         clasues.add("-1 3 -4 0");
         clasues.add("2 -3 0");
         clasues.add("-1 0");

         SAT sat = new SAT(clasues,4,4);
         sat.show();
         Population population = new Population(10, 4, 0.01, 2,sat);
         //traitement(population, 1000000, 4);
         population.traitement(10000,4);
         **/


        /**
         ArrayList<String> clasues = new ArrayList<>();
         clasues.add("-1 2 0");
         clasues.add("-1 3 -4 0");
         clasues.add("2 -3 0");
         clasues.add("-1 0");

         SAT sat = new SAT(clasues,4,4);

         ArrayList<Integer> list = new ArrayList<>();
         list.add(0);
         list.add(1);
         list.add(1);
         list.add(1);
         for(String s : clasues){
         System.out.println("c == " +new Clause(s,4).evaluate(list));
         }

         System.out.println("the evaluation result  "+ sat.evaluate(list));**/

//should we change always the parenst on the selection !


/**
 Population pop = new Population(10,20,0.01,2);
 pop.showPopulation();
 pop.sortPopulation();
 System.out.println("the sorted population :");
 pop.showPopulation();
 pop.selectParents();
 pop.croosover();
 System.out.println("the population after the crossover :");
 pop.showPopulation();
 pop.mutation();
 System.out.println("the population after the mutation :");
 pop.showPopulation();
 **/


/**
 Population pop = new Population(10,20,0.01,15);
 pop.traitement(1000000,20);
 **/
    }


    public static void traitement(Population population, int iterationNbr, int max) {

        for (int i = 0; i < iterationNbr; i++) {
            if (population.getDNA(0).fitnesse(population.getSat()) == max) {
                System.out.println("le problème est satisfiable ");
                System.out.println("La solution la plus optimal est trouvée");
                System.out.println("" + population.getDNA(0).toString());
                return;
            }
            population.sortPopulation();
            population.selectParents();
            population.croosover();
            population.mutation();

        }


        System.out.println("Aucune solution n'est trouvée ");
        System.out.println("" + population.getDNA(0).toString());

    }

    public static ArrayList<String> readFile(String filename) {
        ArrayList<String> file = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                i++;
                if (i > 8 && i < 334) {
                    file.add(line);
                } /**else
                 System.out.println(line);**/
            }
            reader.close();
            return file;
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
            return null;
        }
    }
}
