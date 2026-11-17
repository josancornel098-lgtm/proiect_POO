
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class Fisiere {

    // Salvarea fotbalistilor
    public static void salveazaFotbalisti(Object[] fotbalisti) {

        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get("fotbalisti.txt"))) {

            for (int i = 0; i < fotbalisti.length; i++) {

                Fotbalist f = (Fotbalist) fotbalisti[i];

                writer.write(
                        f.getNume() + "|" +
                                f.getPrenume() + "|" +
                                f.getVarsta() + "|" +
                                f.getGreutate() + "|" +
                                f.getInaltime() + "|" +
                                f.getEchipa() + "|" +
                                f.getPost() + "|" +
                                f.getNumarTricou() + "|" +
                                f.getGoluri() + "|" +
                                f.getMeciuriJucate()
                );

                writer.newLine();
            }

            System.out.println("Fotbalistii au fost salvati.");

        } catch (IOException e) {
            System.out.println("Eroare la salvarea fotbalistilor: " + e.getMessage());
        }
    }


    // Salvarea inotatorilor
    public static void salveazaInotatori(Object[] inotatori) {

        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get("inotatori.txt"))) {

            for (int i = 0; i < inotatori.length; i++) {

                Inotator in = (Inotator) inotatori[i];

                writer.write(
                        in.getNume() + "|" +
                                in.getPrenume() + "|" +
                                in.getVarsta() + "|" +
                                in.getGreutate() + "|" +
                                in.getInaltime() + "|" +
                                in.getStilPreferat() + "|" +
                                in.getMedalii() + "|" +
                                in.getTimpProba() + "|" +
                                in.getCompetitii() + "|" +
                                in.getClub()
                );

                writer.newLine();
            }

            System.out.println("Inotatorii au fost salvati.");

        } catch (IOException e) {
            System.out.println("Eroare la salvarea inotatorilor: " + e.getMessage());
        }
    }


    // Citirea fotbalistilor
    public static Object[] citesteFotbalisti() {

        ArrayList<Object> lista = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("fotbalisti.txt"))) {

            String linie;

            while ((linie = reader.readLine()) != null) {

                String[] date = linie.split("\\|", -1);

                if (date.length != 10) {
                    throw new IOException("Date invalide pentru un fotbalist.");
                }

                Fotbalist f = new Fotbalist(
                        date[0],
                        date[1],
                        Integer.parseInt(date[2]),
                        Double.parseDouble(date[3]),
                        Double.parseDouble(date[4]),
                        date[5],
                        date[6],
                        Integer.parseInt(date[7]),
                        Integer.parseInt(date[8]),
                        Integer.parseInt(date[9])
                );

                lista.add(f);
            }

            System.out.println("Fotbalistii au fost cititi.");

        } catch (IOException | NumberFormatException e) {
            System.out.println("Eroare la citirea fotbalistilor: " + e.getMessage());
        }

        return lista.toArray(new Object[0]);
    }


    // Citirea inotatorilor
    public static Object[] citesteInotatori() {

        ArrayList<Object> lista = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("inotatori.txt"))) {

            String linie;

            while ((linie = reader.readLine()) != null) {

                String[] date = linie.split("\\|", -1);

                if (date.length != 10) {
                    throw new IOException("Date invalide pentru un inotator.");
                }

                Inotator in = new Inotator(
                        date[0],
                        date[1],
                        Integer.parseInt(date[2]),
                        Double.parseDouble(date[3]),
                        Double.parseDouble(date[4]),
                        date[5],
                        Integer.parseInt(date[6]),
                        Double.parseDouble(date[7]),
                        Integer.parseInt(date[8]),
                        date[9]
                );

                lista.add(in);
            }

            System.out.println("Inotatorii au fost cititi.");

        } catch (IOException | NumberFormatException e) {
            System.out.println("Eroare la citirea inotatorilor: " + e.getMessage());
        }

        return lista.toArray(new Object[0]);
    }
}
