package br.edu.utfpr.dv.sireata.apresentacao;

import br.edu.utfpr.dv.sireata.dao.PautaDAO;
import br.edu.utfpr.dv.sireata.model.Pauta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;
import java.util.List;

public class PautaController {

    public PautaDAO pautaDAO;

    @GetMapping("/ata/{ata}")
    public List<Pauta> listarPorAta(@PathVariable int idAta) throws SQLException {
        return pautaDAO.listarPorAta(idAta);
    }

    @PostMapping("/pauta/salvar")
    public int salvar(Pauta pauta) throws SQLException {
        return pautaDAO.salvar(pauta);
    }

}
