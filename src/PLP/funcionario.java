package PLP;

    class funcionario {

        private String nome;
        private double salarioBruto;
        private double imposto;
        private double porc;
        private double salarioLiq;
        private double aumentarSal;


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getSalarioBruto() {
            return salarioBruto;
        }

        public void setSalarioBruto(double salarioBruto) {
            this.salarioBruto = salarioBruto;
        }

        public double getImposto() {
            return imposto;
        }

        public void setImposto(double imposto) {
            this.imposto = imposto;
        }

        public double getPorc() {
            return porc;
        }

        public void setPorc(double porc) {
            this.porc = porc;
        }

        public double getSalarioLiq() {
            return salarioLiq;
        }

        public void setSalarioLiq(double salarioLiq) {
            this.salarioLiq = salarioLiq;
        }

        public double getAumentarSal() {return aumentarSal;}

        public void setAumentarSal(double aumentarSal) {this.aumentarSal = aumentarSal;}

    }
