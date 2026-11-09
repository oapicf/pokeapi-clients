#tag Class
Protected Class PokemonMove

	#tag Property, Flags = &h0
		#tag Note
			The move the Pokémon can learn.
		#tag EndNote
		move As OpenAPIClient.Models.MoveSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The details of the version in which the Pokémon can learn the move.
		#tag EndNote
		version_group_details() As OpenAPIClient.Models.PokemonMoveVersionGroup
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
			Name="move"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_group_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonMoveVersionGroup"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


