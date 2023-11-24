import java.util.Scanner;
import Model.Position;
import Model.Layout;
import Model.Robot;

public class RobotApp {
    public static void main(String[] args){
        new RobotApp();
    }
    
    private Layout layout;
    private Robot robot;
    private Scanner scanner;
    public RobotApp() {
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(0,0));
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("\n\n-------- Permainan Dimulai --------");
        do{
            draw();
            instruction = waitInstruction();
            executeInstruction(instruction);
        }
        while(!instruction.equals("x"));
        System.out.println("\n-------- Permainan Selesai --------");
        System.exit(0);
        return;
    }
    
    
    private void executeInstruction(String instruction) {
        if (instruction.length() < 2) {
            System.out.println("\n\n!!!!!Input tidak valid. Masukkan Perintah yang benar sesuai Instruksi!!!!!");
            return;
        }

        char moveDirection = instruction.charAt(0);
        int steps;
        try {
            steps = Integer.parseInt(instruction.substring(1));
        } catch (NumberFormatException e) {
            //System.out.println("\n\n!!!!!Input tidak valid. Masukkan Perintah yang benar sesuai Instruksi!!!!!");
            return;
        }

        Position newPosition = new Position(robot.getPosition().getX(), robot.getPosition().getY());
        switch(moveDirection) {
            case 'w':
                newPosition.setX(newPosition.getX() - steps);
                break;
            case 's':
                newPosition.setX(newPosition.getX() + steps);
                break;
            case 'a':
                newPosition.setY(newPosition.getY() - steps);
                break;
            case 'd':
                newPosition.setY(newPosition.getY() + steps);
                break;
            default:
                System.out.println("Arah tidak valid. Gunakan 'w', 's', 'a', or 'd'.");
                return;
        }

        if(isValidPosition(newPosition)) {
            robot.setPosition(newPosition);
        } else {
            System.out.println("\n\n!!!!!Robot tidak boleh keluar dari area permainan!!!!!");
        }

    }

    private boolean isValidPosition(Position pos) {
        System.out.println("\n\n!!!!!Berhasil, Robot berpindah tempat sesuai input perintah!!!!!");
        return pos.getX() >= 0 && pos.getX() < layout.getMaxX() && pos.getY() >= 0 && pos.getY() < layout.getMaxY();
    }

    private String waitInstruction() {
        System.out.println("\n-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Dan Tekan 'x' untuk Keluar Aplikasi Robot");
        System.out.print("Input Perintah: ");
        return scanner.nextLine();
    }

    private void draw() {
        System.out.println("\n\n------ Posisi Terbaru ------");
        for(int i = 0; i < layout.getMaxX(); i++) {
            for(int j = 0; j < layout.getMaxY(); j++) {
                if(i == robot.getPosition().getX() && j == robot.getPosition().getY()) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(layout.getArea()[i][j]);
                }
            }
            System.out.println();
        }
    }
}