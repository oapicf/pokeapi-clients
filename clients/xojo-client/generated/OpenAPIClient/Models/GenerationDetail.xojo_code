#tag Class
Protected Class GenerationDetail

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
			A list of abilities that were introduced in this generation.
		#tag EndNote
		abilities() As OpenAPIClient.Models.AbilitySummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The main region travelled in this generation.
		#tag EndNote
		main_region As OpenAPIClient.Models.RegionSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of moves that were introduced in this generation.
		#tag EndNote
		moves() As OpenAPIClient.Models.MoveSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.GenerationName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of Pokémon species that were introduced in this generation.
		#tag EndNote
		pokemon_species() As OpenAPIClient.Models.PokemonSpeciesSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of types that were introduced in this generation.
		#tag EndNote
		types() As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of version groups that were introduced in this generation.
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
			Name="abilities"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilitySummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="main_region"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="moves"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GenerationName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon_species"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
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


