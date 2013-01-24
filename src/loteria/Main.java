/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author itel
 */
public class Main
{

    public static void main(String[] args)
    {
        String linha = null;
        int resultado[] = new int[26];

        for (int i = 0; i < resultado.length; i++)
        {
            resultado[i] = 0;
        }

        try
        {
            FileReader reader = new FileReader("/home/itel/Área de Trabalho/loteria.txt");
            BufferedReader leitor = new BufferedReader(reader);
            while ((linha = leitor.readLine()) != null)
            {
                String[] numeros = linha.split(",");
                for (int i = 0; i < numeros.length; i++)
                {
                    int numero = Integer.valueOf(numeros[i]);
                    resultado[numero] = resultado[numero] + 1;
                }

            }

            for (int i = 1; i < resultado.length; i++)
            {
                System.out.println(i + " = " + resultado[i]);
            }

            leitor.close();
            reader.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
