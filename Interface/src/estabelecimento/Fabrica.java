package estabelecimento;

import equipamentos.equipamentos_copiadora.Copiadora;
import equipamentos.equipamentos_digitalizadora.Digitalizadora;
import equipamentos.equipamentos_impressora.Deskjet;
import equipamentos.equipamentos_impressora.Impressora;
import equipamentos.equipamentos_impressora.Laserjet;
import equipamentos.equiupamentos_multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
