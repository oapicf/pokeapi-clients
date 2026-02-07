--  ------------ EDIT NOTE ------------
--  PokéAPI
--  All the Pokémon data you'll ever need in one place, easily accessible through a modern free open_source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
--  This file was generated with openapi-generator.  You can modify it to implement
--  the client.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/.ads
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
with .Clients;
with .Models;
with Swagger;
with Swagger.Credentials.OAuth;
with Util.Http.Clients.Curl;
with Ada.Text_IO;
with Ada.Command_Line;
with Ada.Calendar.Formatting;
with Ada.Exceptions;
procedure .Client is

   use Ada.Text_IO;

   procedure Usage;

   Server    : constant Swagger.UString := Swagger.To_UString ("http://localhost:8080/v2");
   Arg_Count : constant Natural := Ada.Command_Line.Argument_Count;
   Arg       : Positive := 1;

   procedure Usage is
   begin
      Put_Line ("Usage: defaultPackage {params}...");
   end Usage;

begin
   if Arg_Count <= 1 then
      Usage;
      return;
   end if;
   Util.Http.Clients.Curl.Register;
   declare
      Command : constant String := Ada.Command_Line.Argument (Arg);
      Item    : constant String := Ada.Command_Line.Argument (Arg + 1);
      Cred    : aliased Swagger.Credentials.OAuth.OAuth2_Credential_Type;
      C       : .Clients.Client_Type;
   begin
      C.Set_Server (Server);
      C.Set_Credentials (Cred'Unchecked_Access);
      Arg := Arg + 2;

   exception
      when E : Constraint_Error =>
         Put_Line ("Constraint error raised: " & Ada.Exceptions.Exception_Message (E));

   end;
end .Client;
