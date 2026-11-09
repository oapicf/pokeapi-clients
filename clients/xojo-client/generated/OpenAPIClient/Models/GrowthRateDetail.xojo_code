#tag Class
Protected Class GrowthRateDetail

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
			The formula used to calculate the rate at which the Pokémon species gains level.
		#tag EndNote
		formula As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The descriptions of this characteristic listed in different languages.
		#tag EndNote
		descriptions() As OpenAPIClient.Models.GrowthRateDescription
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of levels and the amount of experienced needed to atain them based on this growth rate.
		#tag EndNote
		levels() As OpenAPIClient.Models.Experience
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of Pokémon species that gain levels at this growth rate.
		#tag EndNote
		pokemon_species() As OpenAPIClient.Models.PokemonSpeciesSummary
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
			Name="formula"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="descriptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GrowthRateDescription"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="levels"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Experience"
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
	#tag EndViewBehavior
End Class
#tag EndClass


