#tag Class
Protected Class PokemonSpritesOther

	#tag Property, Flags = &h0
		#tag Note
			Pokémon Dream World artwork URLs.
		#tag EndNote
		dream_world As OpenAPIClient.Models.PokemonSpritesOtherDreamWorld
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pokémon HOME sprite URLs.
		#tag EndNote
		home As OpenAPIClient.Models.PokemonSpritesOtherHome
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pokémon Showdown sprite URLs.
		#tag EndNote
		showdown As OpenAPIClient.Models.PokemonSpritesOtherShowdown
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
		#tag EndNote
		official_artwork As OpenAPIClient.Models.PokemonSpritesOtherOfficialArtwork
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dream_world"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpritesOtherDreamWorld"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="home"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpritesOtherHome"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="showdown"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpritesOtherShowdown"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="official_artwork"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpritesOtherOfficialArtwork"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


