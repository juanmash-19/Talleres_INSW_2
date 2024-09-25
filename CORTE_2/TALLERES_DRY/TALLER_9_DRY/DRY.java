public void validarEmail(String email) {
    if (!email.contains("@") || !email.contains(".")) {
        System.out.println("Email inválido");
    }
}

// Luego en el código principal:
validarEmail(email1);
validarEmail(email2);
