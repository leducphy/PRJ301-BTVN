<%-- 
    Document   : Home
    Created on : Feb 25, 2023, 9:33:31 PM
    Author     : leducphi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <!-- Font Awesome -->
        <link
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
            rel="stylesheet"
            />
        <!-- Google Fonts -->
        <link
            href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
            rel="stylesheet"
            />
        <!-- MDB -->
        <link
            href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.1.0/mdb.min.css"
            rel="stylesheet"
            />
    </head>
    <body>
        <div class="main">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <!-- Container wrapper -->
                <div class="container-fluid">
                    <!-- Toggle button -->
                    <button
                        class="navbar-toggler"
                        type="button"
                        data-mdb-toggle="collapse"
                        data-mdb-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent"
                        aria-expanded="false"
                        aria-label="Toggle navigation"
                        >
                        <i class="fas fa-bars"></i>
                    </button>

                    <!-- Collapsible wrapper -->
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <!-- Navbar brand -->
                        <a class="navbar-brand mt-2 mt-lg-0" href="#">
                            <img
                                src="https://mdbcdn.b-cdn.net/img/logo/mdb-transaprent-noshadows.webp"
                                height="15"
                                alt="MDB Logo"
                                loading="lazy"
                                />
                        </a>
                        <!-- Left links -->
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link" href="#">Dashboard</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Team</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Projects</a>
                            </li>
                        </ul>
                        <!-- Left links -->
                    </div>
                    <!-- Collapsible wrapper -->

                    <!-- Right elements -->
                    <div class="d-flex align-items-center">
                        <!-- Icon -->
                        <a class="text-reset me-3" href="#">
                            <i class="fas fa-shopping-cart"></i>
                        </a>

                        <!-- Notifications -->
                        <div class="dropdown">
                            <a
                                class="text-reset me-3 dropdown-toggle hidden-arrow"
                                href="#"
                                id="navbarDropdownMenuLink"
                                role="button"
                                data-mdb-toggle="dropdown"
                                aria-expanded="false"
                                >
                                <i class="fas fa-bell"></i>
                                <span class="badge rounded-pill badge-notification bg-danger">1</span>
                            </a>
                            <ul
                                class="dropdown-menu dropdown-menu-end"
                                aria-labelledby="navbarDropdownMenuLink"
                                >
                                <li>
                                    <a class="dropdown-item" href="#">Some news</a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="#">Another news</a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="#">Something else here</a>
                                </li>
                            </ul>
                        </div>
                        <!-- Avatar -->
                        <div class="dropdown">
                            <a
                                class="dropdown-toggle d-flex align-items-center hidden-arrow"
                                href="#"
                                id="navbarDropdownMenuAvatar"
                                role="button"
                                data-mdb-toggle="dropdown"
                                aria-expanded="false"
                                >
                                <img
                                    src="https://mdbcdn.b-cdn.net/img/new/avatars/2.webp"
                                    class="rounded-circle"
                                    height="25"
                                    alt="Black and White Portrait of a Man"
                                    loading="lazy"
                                    />
                            </a>
                            <ul
                                class="dropdown-menu dropdown-menu-end"
                                aria-labelledby="navbarDropdownMenuAvatar"
                                >
                                <li>
                                    <a class="dropdown-item" href="<c:url value="profile"/>">My profile</a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="#">Settings</a>
                                </li>
                                <li>
                                    <a class="dropdown-item" href="#">Logout</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <!-- Right elements -->
                </div>
                <!-- Container wrapper -->
            </nav>
            <!-- Navbar -->
            <div class="main-content" >

            </div>
        </div>
        <!-- MDB -->
        <script
            type="text/javascript"
            src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.1.0/mdb.min.js"
        ></script>
    </body>
</html>
