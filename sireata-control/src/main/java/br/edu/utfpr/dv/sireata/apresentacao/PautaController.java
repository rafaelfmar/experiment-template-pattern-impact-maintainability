package br.edu.utfpr.dv.sireata.apresentacao;

import br.edu.utfpr.dv.sireata.dao.PautaDAO;
import br.edu.utfpr.dv.sireata.model.Pauta;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class PautaController {

    private final PautaDAO pautaDAO;

    @GetMapping("/pauta/ata/{idAta}")
    public List<Pauta> listarPorAta(@PathVariable int idAta) throws SQLException {
        return pautaDAO.listarPorAta(idAta);
    }

    @PostMapping("/pauta/salvar")
    public int salvar(Pauta pauta) throws SQLException {
        return pautaDAO.salvar(pauta);
    }

}
