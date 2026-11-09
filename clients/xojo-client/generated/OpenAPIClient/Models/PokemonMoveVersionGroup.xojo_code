#tag Class
Protected Class PokemonMoveVersionGroup

	#tag Property, Flags = &h0
		#tag Note
			The minimum level to learn the move.
		#tag EndNote
		level_learned_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The method by which the move is learned.
		#tag EndNote
		move_learn_method As OpenAPIClient.Models.MoveLearnMethodSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The version group in which the move is learned.
		#tag EndNote
		version_group As OpenAPIClient.Models.VersionGroupSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
		#tag EndNote
		order As Xoson.O.OptionalInteger
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
			Name="level_learned_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="move_learn_method"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveLearnMethodSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionGroupSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="order"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


