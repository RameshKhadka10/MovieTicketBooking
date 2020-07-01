
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Admin Dashboard</title>

  <!-- Custom fonts for this template-->
  <link href="${pageContext.request.contextPath}/resources/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="${pageContext.request.contextPath}/resources/admin/css/sb-admin-2.min.css" rel="stylesheet">
  
   <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin/css/bootstrap.min.css">

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

      <%@include file="adminheader.jsp" %>

       <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Movie Management 
        <small>Display</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href=""><i class="fa fa-dashboard"></i> Movies</a></li>
        <li class="active">Show</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
    
      <!-- Main row -->
      <div class="row">
        <!--page content here-->
        <div class="col-lg-9">
            
            <div class="panel panel-default">
                        <div class="panel-heading">
                            Displaying all movies
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" 
                                   class="table table-striped table-bordered table-hover"
                                   id="movie_tbl">
                                <thead>
                                    <tr>
                                        <th>Movie ID</th>
                                        <th>Title</th>
                                        <th>Genre</th>
                                        <th>Cast</th>
                                        <th>Director</th>
                                        <th>Duration</th>
                                        <th>Description</th>
                                        <th>Edit</th>
                                        <th>Delete</th>
                                    </tr>
                                </thead> 
                                <tbody>
                                    <c:forEach items="${movielist}" var="mov">
                                        <tr>
                                            <td> ${mov.movie_id} </td>
                                             <td> ${mov.title} </td>
                                              <td> ${mov.genre} </td>
                                              <td> ${mov.cast} </td>
                                              <td> ${mov.director} </td>
                                              <td> ${mov.duration_min} </td>
                                              <td> ${mov.description} </td>
                                               <td><a href="${pageContext.request.contextPath}/editmovie/${mov.movie_id}"> Edit </a></td>
                                               <td><a href="${pageContext.request.contextPath}/deletemovie/${mov.movie_id}"> Delete </a></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
            </div>
                               
        </div>
          
      </div>
      <!-- /.row (main row) -->

    </section>
    <!-- /.content -->
  </div>

      </div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; Your Website 2019</span>
          </div>
        </div>
      </footer>
      <!-- End of Footer -->

    
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="login.html">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="${pageContext.request.contextPath}/resources/admin/vendor/jquery/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/admin/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="${pageContext.request.contextPath}/resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="${pageContext.request.contextPath}/resources/admin/js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="${pageContext.request.contextPath}/resources/admin/vendor/chart.js/Chart.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="${pageContext.request.contextPath}/resources/admin/js/demo/chart-area-demo.js"></script>
  <script src="${pageContext.request.contextPath}/resources/admin/js/demo/chart-pie-demo.js"></script>

</body>

</html>
