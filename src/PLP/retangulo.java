package PLP;


    public  class retangulo {

        private double largura;
        private double altura;
        private double area;
        private double perimetro;
        private double diagonal;

        public double getLargura() {
            return largura;
        }

        public void setLargura(double largura) {
            this.largura = largura;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double getArea() {
            return area;
        }

        public double setArea(double larg, double alt) {      
            return larg * alt ;
        }

        public double getPerimetro() {
            return perimetro;
        }

        public void setPerimetro(double perimetro) {
            this.perimetro = perimetro;
        }

        public double getDiagonal() {
            return diagonal;
        }

        public void setDiagonal(double diagonal) {
            this.diagonal = diagonal;
        }

    }

