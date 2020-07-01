
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

  <title>SB Admin 2 - Dashboard</title>

  <!-- Custom fonts for this template-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin/css/bootstrap.min.css">
  <link href="${pageContext.request.contextPath}/resources/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

   Custom styles for this template
  <link href="${pageContext.request.contextPath}/resources/admin/css/sb-admin-2.min.css" rel="stylesheet">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin/dist/css/AdminLTE.min.css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/admin/dist/css/skins/_all-skins.min.css">

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

      <%@include file="adminheader.jsp" %>

 <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-9">
                    <h1 class="panel-header">MOVIE MANAGEMENT</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
           
      
  
        <div class="row">
            <div class="col-md-12 col-lg-9">
                <div class="panel panel-danger">
                    <div class="page-header">
                        <h3 class="text-center text-info">Add New Movie</h3>
                        
                    </div>
<!--                     <div class="panel-heading">
                           Add New Movies
                        </div>-->
                    <div class="panel-body">
                        <form action="${pageContext.request.contextPath}/addmovie" method="post" roles="form">
                            <div class="form-group">
                                <label for="inTitle">Movie Title</label>
                                <input type="text" class="form-control" id="inTitle" name="title" placeholder="Enter movie title"/>
                            </div>
                            <div class="form-group">
                                <label for="inGenre">Movie Genre</label>
                                <input type="text" class="form-control" id="inGenre" name="genre" placeholder="Enter movie genre"/>
                            </div>
                            <div class="form-group">
                                <label for="inDirector"> Movie Director</label>
                                <input type="text" class="form-control" id="inDirector" name="director" placeholder="Enter movie director"/>
                                
                                
                            </div>
                            <div class="form-group">
                                <label for="inDuration">Movie Duration</label>
                                <input type="number" class="form-control" id="inDuration" name="duration" placeholder="Enter movie duration"/>
                            </div>
                            
                             <div class="form-group">
                                <label for="inDesc">Movie Description</label>
                                <input type="text" class="form-control" id="inDesc" name="description" placeholder="Enter movie description"/>
                            </div>
                             <div class="form-group">
                                <label for="inCast">Movie Cast</label>
                                <input type="text" class="form-control" id="inCast" name="cast" placeholder="Enter movie cast"/>
                            </div>
                            <div class="form-group">
                                <input type="submit" value="save" class="btn btn-primary"/>
                                <input type="reset" value="Reset" class="btn btn-warning"/>
                            </div>
                        </form>
                            </div>
                        
                    </div> 
                    </div>
                    
        </div>
        
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

    </div>
    <!-- End of Content Wrapper -->

  </div>
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
            <span aria-hidden="true">Ã</span>
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
  <script src="${pageContext.request.contextPath}/resources/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!--   Core plugin JavaScript-->
  <script src="${pageContext.request.contextPath}/resources/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

<!--   Custom scripts for all pages-->
  <script src="${pageContext.request.contextPath}/resources/admin/js/sb-admin-2.min.js"></script>

<!--   Page level plugins -->
  <script src="${pageContext.request.contextPath}/resources/admin/vendor/chart.js/Chart.min.js"></script>

<!--   Page level custom scripts -->
  <script src="${pageContext.request.contextPath}/resources/admin/js/demo/chart-area-demo.js"></script>
  <script src="${pageContext.request.contextPath}/resources/admin/js/demo/chart-pie-demo.js"></script>

  
  <script src="${pageContext.request.contextPath}/resources/admin/plugins/jQuery/jquery-2.2.3.min.js"></script>

<!-- Bootstrap 3.3.6 -->
<script src="${pageContext.request.contextPath}/resources/admin/js/bootstrap.min.js"></script>
<!-- Slimscroll -->
<script src="${pageContext.request.contextPath}/resources/admin/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${pageContext.request.contextPath}/resources/admin/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/resources/admin/dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/resources/admin/dist/js/demo.js"></script>

<script src="${pageContext.request.contextPath}/resources/admin/js/bootstrap.min.js"></script>
</body>

</html>
