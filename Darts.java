class Darts {
    double x ;
    double y ;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        if(this.x*this.x + this.y * this.y >100){
            return 0;
        }
        else if(this.x*this.x + this.y * this.y >25){
            return 1;
        }
        else if(this.x*this.x + this.y * this.y >1){
            return 5;
        }
        else{
            return 10;
        }
    }
}
