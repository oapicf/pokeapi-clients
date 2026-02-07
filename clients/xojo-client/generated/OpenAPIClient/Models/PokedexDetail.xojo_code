#tag Class
Protected Class PokedexDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		is_main_series As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		descriptions() As OpenAPIClient.Models.PokedexDescription
	#tag EndProperty


	#tag Property, Flags = &h0
		names() As OpenAPIClient.Models.PokedexName
	#tag EndProperty


	#tag Property, Flags = &h0
		pokemon_entries() As OpenAPIClient.Models.PokedexDetailPokemonEntriesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		region As OpenAPIClient.Models.RegionSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		version_groups() As OpenAPIClient.Models.AbilityDetailPokemonInnerPokemon
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
			Type="PokedexDetailPokemonEntriesInner"
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
			Type="AbilityDetailPokemonInnerPokemon"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


