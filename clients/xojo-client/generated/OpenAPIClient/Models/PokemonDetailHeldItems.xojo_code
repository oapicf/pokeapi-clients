#tag Class
Protected Class PokemonDetailHeldItems

	#tag Property, Flags = &h0
		item As OpenAPIClient.Models.AbilityDetailPokemonInnerPokemon
	#tag EndProperty


	#tag Property, Flags = &h0
		version_details() As OpenAPIClient.Models.ItemDetailHeldByPokemonInnerVersionDetailsInner
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
			Name="item"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityDetailPokemonInnerPokemon"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemDetailHeldByPokemonInnerVersionDetailsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


