<%-- 
    Document   : homepage_guest
    Created on : Oct 31, 2023, 9:46:35 PM
    Author     : Administrator
--%>

<%@page import="Shoes.ShoeDAO"%>
<%@page import="Shoes.ShoeDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Shoes Page</title>
        <link rel="icon" href="image\shoelogo.png">
        <link rel="stylesheet" href="CSS\homepage_guest.css">
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    </head>

    <body>
        <!-- header -->
        <div class="header">
            <img src="image\shoelogo.png"
                 alt="shoes">
            <div class="header_info" style="color: white;">
                <a href="login.jsp"><img
                        src="image\login.png"
                        alt="Login">Login</a>
                <a href="Blog.jsp"><img
                        src="image\blog (2).png "
                        alt="shopping-cart">News</a>
            </div>
        </div>

        <div style="text-align: right; transform: translateX(20px); margin-top: 20px; ">
            <a href="login.jsp">
                <button style="background: #FF9900; font-weight: bold; padding: 5px 10px; border: 0.5px ">Create New Shoes</button>
            </a>
        </div>



        <form action="MainController">
        <div class="container">
            <div class="row mb-5">
                <div class="col-md-3">
                    <div class="card mb-4">
                        <div class="card-header" style="font-weight: bold;">Category</div>
                        <div class="list-group list-group-flush">
                            <a href="CategoryController?byCategory=Sport" class="list-group-item list-group-item-action">Sport</a>
                            <a href="CategoryController?byCategory=Party" class="list-group-item list-group-item-action ">Party</a>
                        </div>
                    </div>
                    <div class="card">
                        <div class="card-body p-1">
                            <div class="card border-0 b-3">
                                <div class="card-header p-2 bg-white" data-toggle="collapse" data-target="#collapseExample1"
                                     aria-expanded="false">
                                    <p class="m-0 h6">Brand</p>
                                </div>
                                <div class="card-body p-0 collapse show" id="collapseExample1">
                                    <ul class="list-group list-group-flush" style="height:200px;overflow:auto;">
                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck1" name="brand" value="Nike">
                                                <label class="custom-control-label" for="customCheck1">Nike</label>
                                            </div>
                                        </li>
                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck2" name="brand" value="Jordan">
                                                <label class="custom-control-label" for="customCheck2">Jordan</label>
                                            </div>
                                        </li>
                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck3" name="brand" value="Adidas">
                                                <label class="custom-control-label" for="customCheck3">Adidas</label>
                                            </div>
                                        </li>
                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck4" name="brand" value="Adidas">
                                                <label class="custom-control-label" for="customCheck4">Puma</label>
                                            </div>
                                        </li>
                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck5">
                                                <label class="custom-control-label" for="customCheck5">Converse</label>
                                            </div>
                                        </li>

                                    </ul>
                                </div>
                            </div>


                            <div class="card border-0 b-3">
                                <div class="card-header p-2 bg-white" data-toggle="collapse" data-target="#collapseExample4"
                                     aria-expanded="false">
                                    <p class="m-0 h6">Price</p>
                                </div>
                                <div class="card-body p collapse show" id="collapseExample4">
                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                            <label>Min</label>
                                            <input class="form-control" placeholder="$0" type="number" min="0"
                                                   max="99999999999">
                                        </div>
                                        <div class="form-group text-right col-md-6">
                                            <label>Max</label>
                                            <input class="form-control" placeholder="$1,0000" type="number" min="0"
                                                   max="9999999999">
                                        </div>
                                    </div>

                                    <div class="card-header p-2 bg-white" data-toggle="collapse"
                                         data-target="#collapseExample1" aria-expanded="false">
                                        <p class="m-0 h6">Rating</p>
                                    </div>

                                    <ul class="list-group list-group-flush" style="height:200px;overflow:auto;">
                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck6">
                                                <label class="custom-control-label" for="customCheck6"
                                                       style="color: #FF9900;">
                                                    <i class="fa-xs far fa-star " style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star " style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star " style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                </label>
                                            </div>
                                        </li>

                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck7">
                                                <label class="custom-control-label" for="customCheck7">
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                </label>
                                            </div>
                                        </li>

                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck8">
                                                <label class="custom-control-label" for="customCheck8">
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                </label>
                                            </div>
                                        </li>

                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck9">
                                                <label class="custom-control-label" for="customCheck9">
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                </label>
                                            </div>
                                        </li>

                                        <li class="list-group-item p-2 d-flex justify-content-between align-items-center">
                                            <div class="custom-control custom-checkbox">
                                                <input type="checkbox" class="custom-control-input" id="customCheck10">
                                                <label class="custom-control-label" for="customCheck10">
                                                    <i class="fa-xs far fa-star" style="color: #FF9900;"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                    <i class="fa-xs far fa-star"></i>
                                                </label>
                                            </div>
                                        </li>
                                </div>
                            </div>
                        </div>





                        <div class="card-footer">
                            <button type="button" class="btn btn-block btn-primary">Apply</button>
                        </div>
                    </div>
                      </form>
                </div>
                <div class="col-md-9">
                    <div class="card-body">
                        <div class="row">
                            <% ArrayList<ShoeDTO> shoes = new ArrayList<>();
                               String category = (String) session.getAttribute("Cate");
                                ShoeDAO dao = new ShoeDAO();
                                if(category == "Cate"){
                                    shoes=  (ArrayList<ShoeDTO>) session.getAttribute("shoesList");
                                }else{
                                    shoes = dao.AlllistShoe();
                                }      
                                if (shoes != null) {
                                    for (ShoeDTO shoe : shoes) {
                            %> 
                            <div class="col-md-4 mb-4">
                                <div class="card">
                                    <img class="card-img-top" src="<%=shoe.getImage()%>" alt="" />
                                    <div class="card-body">
                                        <p class="h5 m-0">
                                            <!-- Giá sản phẩm -->
                                            <%= shoe.getPrice()%>
                                        </p>
                                        <p class="h6">
                                            <!-- Tên sản phẩm  -->
                                            <%= shoe.getShoesName()%>
                                        </p>

                                    </div>
                                    <div class="card-footer p-0" style="text-align: center;">
                                        <div class="btn-group" role="group">
                                            <button type="button" class="btn btn-light">
                                                <i class="fas fa-cart-plus"></i>
                                                <span>Add Cart</span>
                                            </button>

                                        </div>
                                    </div>
                                </div>
                            </div>
                            <%
                                    }
                                }
                            %>

                            <!--div class="card-footer p-3">
                                <div class="row">
                                    <div class="col-md-6">
                                        <ul class="pagination m-0 ">
                                            <li class="page-item disabled">
                                                <a class="page-link" href="#" tabindex="-1"
                                                    aria-disabled="true">Previous</a>
                                            </li>
                                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                                            <li class="page-item"><a class="page-link" href="#">2</a></li>
                                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                                            <li class="page-item">
                                                <a class="page-link" href="#">Next</a>
                                            </li>
                                        </ul>
                                    </div>
    
                                </div>
                            </div>-->
                        </div>
                    </div>
                </div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>
                <div class="row"></div>

                </body>

                </html>