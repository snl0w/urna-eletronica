import java.util.Scanner;

public class Principal {
    
    // Números dos Senadores
    private int a150 = 0, f500 = 0, j444 = 0, l405 = 0, l135 = 0, m456 = 0, a290 = 0, g131 = 0, m210 = 0, s510 = 0, v111 = 0, w251 = 0;
    
    // Números dos Presidentes
    private int b17 = 0, h13 = 0, c12 = 0, b50 = 0, c51 = 0, m18 = 0, g45 = 0, a19 = 0, h15 = 0, j30 = 0;
    
    // Variaveis para os votos
    private float totalVotos = 0, votoBranco = 0, votoNulo = 0;

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.executarVotacao();
    }

    public void executarVotacao() {
        int votoInformado = 0;
        
        // Resposta "s" ou "n"
        char resp = 'a';
        
        Presidentes presidentes = new Presidentes();
        Senadores senadores = new Senadores();
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("-------------Urna Eletrónica-------------\n");
            senadores.menuSenadores();
            
            System.out.println("Digite 0 para voto branco.\n");
            System.out.println("Informe o primeiro Senador que queira votar: ");
            votoInformado = leitor.nextInt();
            votarSenador(votoInformado);

            System.out.println("Informe o segundo Senador que queira votar: ");
            votoInformado = leitor.nextInt();
            votarSenador(votoInformado);
            
            System.out.println("-------------Urna Eletrónica-------------\n\n");
            presidentes.menuPresidentes();
            
            System.out.println("Digite 0 para voto branco.\n");
            System.out.println("Informe o Presidente que queira votar: ");
            votoInformado = leitor.nextInt();
            votarPresidente(votoInformado);
            
            System.out.println("\nDeseja votar novamente? (s/n): ");
            resp = leitor.next().charAt(0);
            
        } while (resp != 'n' && resp != 'N');
        
        System.out.println("Dados gerais:\n\n"
                + "Total de votos válidos: " + totalVotos + "\n"
                + "Total de votos brancos: " + votoBranco + "\n"
                + "Total de votos nulos: " + votoNulo + "\n");
        
        if (totalVotos != 0) {
            System.out.println("Porcentagem de total de votos brancos sobre votos válidos: " + (votoBranco / totalVotos) * 100);
            System.out.println("Porcentagem de total de votos nulos sobre votos válidos: " + (votoNulo / totalVotos) * 100);
        }

        senadores.resultadosSenadores(a150, f500, j444, l405, l135, m456, a290, g131, m210, s510, v111, w251);
        presidentes.resultadosPresidentes(b17, h13, c12, b50, c51, m18, g45, a19, h15, j30);
        leitor.close();
    }

    private void votarSenador(int voto) {
        switch (voto) {
            case 150: a150++; 
            break;
            case 500: f500++; 
            break;
            case 444: j444++; 
            break;
            case 405: l405++; 
            break;
            case 135: l135++; 
            break;
            case 456: m456++; 
            break;
            case 290: a290++; 
            break;
            case 131: g131++; 
            break;
            case 210: m210++; 
            break;
            case 510: s510++; 
            break;
            case 111: v111++; 
            break;
            case 251: w251++; 
            break;
            case 0: votoBranco++; 
            break;
            default: votoNulo++; 
            break;
        }
        totalVotos++;
    }

    private void votarPresidente(int voto) {
        switch (voto) {
            case 17: b17++; 
            break;
            case 13: h13++; 
            break;
            case 12: c12++; 
            break;
            case 50: b50++; 
            break;
            case 51: c51++; 
            break;
            case 18: m18++; 
            break;
            case 45: g45++; 
            break;
            case 19: a19++; 
            break;
            case 15: h15++; 
            break;
            case 30: j30++; 
            break;
            case 0: votoBranco++; 
            break;
            default: votoNulo++; 
            break;
        }
        totalVotos++;
    }
}
