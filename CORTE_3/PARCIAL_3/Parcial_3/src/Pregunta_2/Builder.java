/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta_2;

/**
 *
 * @author juanm
 */
public class Builder {
        private String tipoTomate;
        private String tipoLechuga;
        private String tipoCarne;
        private String tipoQueso;
        private String tipoPan;

        public Builder setTipoTomate(String tipoTomate) {
            this.tipoTomate = tipoTomate;
            return this;
        }
        
        public Builder setTipoLechuga(String tipoTomate) {
            this.tipoLechuga = tipoLechuga;
            return this;
        }

        public Builder setTipoCarne(String tipoCarne) {
            this.tipoCarne = tipoCarne;
            return this;
        }

        public Builder setTipoQueso(String tipoQueso) {
            this.tipoQueso = tipoQueso;
            return this;
        }

        public Builder setTipoPan(String tipoPan) {
            this.tipoPan = tipoPan;
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }
