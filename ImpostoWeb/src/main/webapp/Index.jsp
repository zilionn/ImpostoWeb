<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora de Impostos</title>
</head>
<body>
	<h2>Calculadora de Impostos</h2>

    <form action="/calculate" method="POST">
        Área Total: <input type="number" name="areaTotal" step="0.1" required><br>
        Número de Cômodos: <input type="number" name="numComodos" required><br>
        Número de Quartos: <input type="number" name="numQuartos" required><br>
        Área da Garagem: <input type="number" name="areaGaragem" step="0.1"><br>
        Idade do Imóvel: <input type="number" name="idade" required><br>
        Cidade: 
        <select name="cidade">
            <option value="SaoPaulo">São Paulo</option>
            <option value="BeloHorizonte">Belo Horizonte</option>
            <option value="PortoAlegre">Porto Alegre</option>
            <option value="Curitiba">Curitiba</option>
        </select><br><br>

        <input type="submit" value="Calcular">
	</form>

</body>
</html>