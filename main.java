
public static void main (String args[]){
    int a = 7; 
    int b = 3;
    System.out.println(mult(a,b));

    int x = 4; 
    System.out.println(sum(x));

    String c = "casa";
    System.out.println(inv(c));
}

// Exercício 1 
public static int mult (int x, int y){
    if (x == 0) return 0; 
    return y + mult(x - 1, y); 
}

// Exercício 3
public static double sum (int n){
    if (n == 1) return 1.0; 
    return (1.0 / n) + sum(n - 1);
}

// Exercício 4
public static String inv (String m){
    if (m.length() <= 1) { 
            return m;
        }
    return m.charAt(m.length() - 1) + inv(m.substring(0, m.length() - 1));
}