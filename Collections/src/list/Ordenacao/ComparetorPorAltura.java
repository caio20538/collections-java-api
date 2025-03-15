package list.Ordenacao;

import java.util.Comparator;
import java.util.List;

public class ComparetorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
