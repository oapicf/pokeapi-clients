//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/move_learn_method_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_move_version_group.g.dart';

/// PokemonMoveVersionGroup
///
/// Properties:
/// * [levelLearnedAt] - The minimum level to learn the move.
/// * [moveLearnMethod] - The method by which the move is learned.
/// * [versionGroup] - The version group in which the move is learned.
/// * [order] - Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
@BuiltValue()
abstract class PokemonMoveVersionGroup implements Built<PokemonMoveVersionGroup, PokemonMoveVersionGroupBuilder> {
  /// The minimum level to learn the move.
  @BuiltValueField(wireName: r'level_learned_at')
  int get levelLearnedAt;

  /// The method by which the move is learned.
  @BuiltValueField(wireName: r'move_learn_method')
  MoveLearnMethodSummary get moveLearnMethod;

  /// The version group in which the move is learned.
  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  /// Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
  @BuiltValueField(wireName: r'order')
  int? get order;

  PokemonMoveVersionGroup._();

  factory PokemonMoveVersionGroup([void updates(PokemonMoveVersionGroupBuilder b)]) = _$PokemonMoveVersionGroup;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonMoveVersionGroupBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonMoveVersionGroup> get serializer => _$PokemonMoveVersionGroupSerializer();
}

class _$PokemonMoveVersionGroupSerializer implements PrimitiveSerializer<PokemonMoveVersionGroup> {
  @override
  final Iterable<Type> types = const [PokemonMoveVersionGroup, _$PokemonMoveVersionGroup];

  @override
  final String wireName = r'PokemonMoveVersionGroup';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonMoveVersionGroup object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'level_learned_at';
    yield serializers.serialize(
      object.levelLearnedAt,
      specifiedType: const FullType(int),
    );
    yield r'move_learn_method';
    yield serializers.serialize(
      object.moveLearnMethod,
      specifiedType: const FullType(MoveLearnMethodSummary),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
    if (object.order != null) {
      yield r'order';
      yield serializers.serialize(
        object.order,
        specifiedType: const FullType.nullable(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonMoveVersionGroup object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonMoveVersionGroupBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'level_learned_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.levelLearnedAt = valueDes;
          break;
        case r'move_learn_method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveLearnMethodSummary),
          ) as MoveLearnMethodSummary;
          result.moveLearnMethod.replace(valueDes);
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        case r'order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.order = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonMoveVersionGroup deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonMoveVersionGroupBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


