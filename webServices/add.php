<?php

include ("db_connect.php");

$response=array();

if( isset($_GET["adress"]) 
	AND isset ($_GET["age"])
    AND isset($_GET["email"]) 
	AND isset ($_GET["experience_professionnelle"])
	AND isset ($_GET["niveau_etude"]) 
	AND isset ($_GET["nom"]) 
    AND isset ($_GET["prenom"])
	AND isset ($_GET["specialite"])
	AND isset ($_GET["telephone"])) 
    
{
	$adress=$_GET["adress"];
	$age = $_GET["age"];
	$email = $_GET["email"];
	$experience_professionnelle = $_GET["experience_professionnelle"];
	$niveau_etude = $_GET["niveau_etude"];
	$nom = $_GET["nom"];
	$prenom = $_GET["prenom"];
	$specialite = $_GET["specialite"];
	$telephone = $_GET["telephone"];
	
	
	
	
	$req=mysqli_query($cnx, " insert into appemplois(adress,age,email,experience_professionnelle,niveau_etude,nom,prenom,specialite,telephone) 
	values('$adress','$age','$email', '$experience_professionnelle','$niveau_etude','$nom','$prenom','$specialite','$telephone')");
	
	
	if($req)
	{
	$response["success"]=1;
	$response["message"]="inserted !";
	
	echo json_encode($response);
	
	}
	else
		{
			
	$response["success"]=0;
	$response["message"]="request error";
	
	echo json_encode($response);	
		
	}
	
	}
else
{
	$response["success"]=0;
	$response["message"]="required field is missing";
	
	echo json_encode($response);	
}

?>














