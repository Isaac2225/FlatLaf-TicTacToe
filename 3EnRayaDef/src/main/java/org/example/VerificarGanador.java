package org.example;

public class VerificarGanador {
    Tablero t;

    public VerificarGanador(Tablero t){
        this.t=t;
    }

    public boolean ganador1(){
        boolean ganador=false;
        if(t.getLblx1().isVisible()&&t.getLblx2().isVisible()&&t.getLblx3().isVisible()){
            return ganador=true;
        }else if(t.getLblx4().isVisible()&&t.getLblx5().isVisible()&&t.getLblx6().isVisible()){
            return ganador=true;
        }else if(t.getLblx7().isVisible()&&t.getLblx8().isVisible()&&t.getLblx9().isVisible()){
            return ganador=true;
        }else if(t.getLblx1().isVisible()&&t.getLblx4().isVisible()&&t.getLblx7().isVisible()){
            return ganador=true;
        }else if(t.getLblx2().isVisible()&&t.getLblx5().isVisible()&&t.getLblx8().isVisible()){
            return ganador=true;
        }else if(t.getLblx3().isVisible()&&t.getLblx6().isVisible()&&t.getLblx9().isVisible()){
            return ganador=true;
        }else if(t.getLblx1().isVisible()&&t.getLblx5().isVisible()&&t.getLblx9().isVisible()){
            return ganador=true;
        }else if(t.getLblx3().isVisible()&&t.getLblx5().isVisible()&&t.getLblx7().isVisible()){
            return ganador=true;
        }else{
            return ganador=false;
        }
    }
    public boolean ganador2(){
        boolean ganador=false;
        if(t.getLblo1().isVisible()&&t.getLblo2().isVisible()&&t.getLblo3().isVisible()){
            return ganador=true;
        }else if(t.getLblo4().isVisible()&&t.getLblo5().isVisible()&&t.getLblo6().isVisible()){
            return ganador=true;
        }else if(t.getLblo7().isVisible()&&t.getLblo8().isVisible()&&t.getLblo9().isVisible()){
            return ganador=true;
        }else if(t.getLblo1().isVisible()&&t.getLblo4().isVisible()&&t.getLblo7().isVisible()){
            return ganador=true;
        }else if(t.getLblo2().isVisible()&&t.getLblo5().isVisible()&&t.getLblo8().isVisible()){
            return ganador=true;
        }else if(t.getLblo3().isVisible()&&t.getLblo6().isVisible()&&t.getLblo9().isVisible()){
            return ganador=true;
        }else if(t.getLblo1().isVisible()&&t.getLblo5().isVisible()&&t.getLblo9().isVisible()){
            return ganador=true;
        }else if(t.getLblo3().isVisible()&&t.getLblo5().isVisible()&&t.getLblo7().isVisible()){
            return ganador=true;
        }else{
            return ganador=false;
        }
    }
    public boolean empate(boolean ganador1, boolean ganador2){
        boolean empate=false;

        if((t.getLblx1().isVisible()||t.getLblo1().isVisible())&&(t.getLblx2().isVisible()||t.getLblo2().isVisible())&&(t.getLblx3().isVisible()||t.getLblo3().isVisible())){
            if((t.getLblx4().isVisible()||t.getLblo4().isVisible())&&(t.getLblx5().isVisible()||t.getLblo5().isVisible())&&(t.getLblx6().isVisible()||t.getLblo6().isVisible())){
                if((t.getLblx7().isVisible()||t.getLblo7().isVisible())&&(t.getLblx8().isVisible()||t.getLblo8().isVisible())&&(t.getLblx9().isVisible()||t.getLblo9().isVisible())){
                    if(!ganador1&&!ganador2){
                        empate=true;
                    }
                }
            }
        }

        return empate;
    }
}