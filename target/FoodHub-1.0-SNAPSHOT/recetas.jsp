<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0 shrink-to-fit=no">
    <title>Recetas</title>

    <link rel="stylesheet" href="assets/vendors/themify-icons/css/themify-icons.css">

    <link rel="stylesheet" href="assets/vendors/animate/animate.css">

    <!-- Bootstrap + FoodHut main styles -->
	<link rel="stylesheet" href="assets/css/foodhut.css">
</head>
<body>
    <nav class="custom-navbar navbar navbar-expand-lg navbar-dark fixed-top" data-spy="affix" data-offset-top="10">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <button class="btn btn-outline-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="false" aria-expanded="false">
                        iniciar secion
                     </button>
                     <div class="dropdown-menu form">
                        <form class="px-4 py-3">
                           <div class="form-group">
                              <input type="nombre de usuario" class="form-control" id="exampleDropdownFormEmail1" placeholder="nombre">
                           </div>
                           <div class="form-group">
                              <input type="contraseña" class="form-control" id="exampleDropdownFormPassword1" placeholder="contraseña">
                           </div>
                           <button type="submit" class="btn btn-primary btn-block">Iniciar secion</button>
                        </form>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#"><small>Eres nuevo por aqui, crea un usuario</small></a>
                     </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="recetas.jsp">Recetas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="administrador.jsp">Administrador</a>
                </li>
            </ul>
            <a class="navbar-brand m-auto" href="index.jsp">
                <img src="assets/imgs/logo.svg" class="brand-img" alt="">
                <span class="brand-txt">Food Hub</span>
            </a>
            <ul class="navbar-nav">
                <li class="nav-item">
                    
                </li>
                <li class="nav-item">
                    
                </li>
                <li class="nav-item">
                    
                </li>
                <li class="nav-item">
                    
                </li>
            </ul>
        </div>
    </nav>
    <header id="home" class="header">
    </header>
    <div>
        <table class="table table-bordered">
            <tr>
                <th>
                    Nombre
                </th>
                <th>
                    Descripcion
                </th>
                <th>
                    Ingredientes
                </th>
            </tr>
            <%
                List<Receta> ListaRecetas = (List) request.getSession().getAtribute("listaRecetas");
                for(Receta res : ListaRecetas){
            %>
            <tr>
                <th>
                    <%=res.getNombre()%>
                </th>
                <th>
                    <%=res.getDescripcion()%>
                </th>
                <th>
                    <%=res.getIngedientes()%>
                </th>
            </tr>                
            <%}%>
        </table>
    </div>
    <div class="col-md-6">
        <hr>
        <nav aria-label="Page navigation example">
           <ul class="pagination pagination-sm">
              <li class="page-item"><a class="page-link" href="#"><i class="ti-angle-double-left"></i></a></li>
              <li class="page-item"><a class="page-link" href="#">1</a></li>
              <li class="page-item"><a class="page-link" href="#">2</a></li>
              <li class="page-item"><a class="page-link" href="#">3</a></li>
              <li class="page-item"><a class="page-link" href="#">4</a></li>
              <li class="page-item"><a class="page-link" href="#">5</a></li>
              <li class="page-item"><a class="page-link" href="#"><i class="ti-angle-double-right"></i></a></li>
           </ul>
        </nav>
    </div>
</body>
</html>