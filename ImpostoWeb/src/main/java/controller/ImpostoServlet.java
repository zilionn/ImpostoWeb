package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.BeloHorizonteStrategy;
import model.CuritibaStrategy;
import model.ImpostoStrategy;
import model.PortoAlegreStrategy;
import model.Propriedade;
import model.SaoPauloStrategy;

@WebServlet("/index")
public class ImpostoServlet extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double areaTotal = Double.parseDouble(req.getParameter("areaTotal"));
        int numComodos = Integer.parseInt(req.getParameter("numComodos"));
        int numQuartos = Integer.parseInt(req.getParameter("numQuartos"));
        double areaGaragem = Double.parseDouble(req.getParameter("areaGaragem"));
        int idade = Integer.parseInt(req.getParameter("idade"));
        String cidade = req.getParameter("cidade");
        
        Propriedade property = new Propriedade();
        property.setArea(areaTotal);
        property.setAreaGaragem(areaGaragem);
        property.setIdade(idade);
        property.setNumComodos(numComodos);
        property.setNumQuartos(numQuartos);
        
        ImpostoStrategy taxStrategy = null;
        switch (cidade) {
            case "SaoPaulo":
                taxStrategy = new SaoPauloStrategy();
                break;
            case "BeloHorizonte":
                taxStrategy = new BeloHorizonteStrategy();
                break;
            case "PortoAlegre":
                taxStrategy = new PortoAlegreStrategy();
                break;
            case "Curitiba":
                taxStrategy = new CuritibaStrategy();
                break;
        }

        TaxCalculator calculator = new TaxCalculator(taxStrategy);
        double tax = calculator.calculate(property);

        req.setAttribute("tax", tax);
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }
}