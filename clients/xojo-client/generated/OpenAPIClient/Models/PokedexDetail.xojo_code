#tag Class
Protected Class PokedexDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not this Pokédex originated in the main series of the video games.
		#tag EndNote
		is_main_series As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The description of this resource listed in different languages.
		#tag EndNote
		descriptions() As OpenAPIClient.Models.PokedexDescription
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.PokedexName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of Pokémon catalogued in this Pokédex and their indexes.
		#tag EndNote
		pokemon_entries() As OpenAPIClient.Models.PokemonDexNumber
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The region this Pokédex catalogues Pokémon for.
		#tag EndNote
		region As OpenAPIClient.Models.RegionSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of version groups this Pokédex is relevant to.
		#tag EndNote
		version_groups() As OpenAPIClient.Models.VersionGroupSummary
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_main_series"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="descriptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokedexDescription"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokedexName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonDexNumber"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="region"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionGroupSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


